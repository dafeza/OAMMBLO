package com.fr4gus.android.oammblo.ui;

import java.util.Date;
import java.util.List;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.fr4gus.android.oammblo.OammbloApp;
import com.fr4gus.android.oammblo.R;
import com.fr4gus.android.oammblo.bo.Tweet;
import com.fr4gus.android.oammblo.data.DummyTwitterService;
import com.fr4gus.android.oammblo.data.TwitterService;
import com.fr4gus.android.oammblo.util.BackgroundTask;
import com.fr4gus.android.oammblo.util.IOManager;
import com.fr4gus.android.oammblo.util.ImageDownloader;
import com.fr4gus.android.oammblo.util.LogIt;

public class TimelineActivity extends OammbloActivity {
    private ListView mTimeline;
    private TwitterService twitterService;
    private ImageDownloader imageDownloader;
    TweetViewHolder holder = null;
    Tweet tweet = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timeline);
        
        imageDownloader = OammbloApp.getInstance().getImageDownloader();
        mTimeline = (ListView) findViewById(R.id.timeline_list);
        
        
        new BackgroundTask() {
        	List<Tweet> tweets;
        	
        	
			@Override
			public void work() {
				TwitterService service = OammbloApp.getInstance().getTwitterService();				
                tweets = service.getTimeline();			
			}
			
			@Override
			public void error(Throwable error) {
				toast("Unable to retrieve tweets");
				
			}
			
			@Override
			public void done() {
				mTimeline.setAdapter(new TweetAdapter(tweets));				
			}
		};

    }
        

    private class TweetAdapter extends BaseAdapter {
        List<Tweet> tweets;

        public TweetAdapter(List<Tweet> timeline) {
            tweets = timeline;
        }
              

        @Override
        public int getCount() {
            return tweets.size();
        }

        @Override
        public Object getItem(int position) {
            return tweets.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            
            LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if ( convertView == null) {
                convertView = inflater.inflate(R.layout.timeline_tweet, null);
                holder = new TweetViewHolder();
                holder.message = (TextView) convertView.findViewById(R.id.tweet_message);
                holder.author = (TextView) convertView.findViewById(R.id.tweet_author);
                holder.timestamp = (TextView) convertView.findViewById(R.id.tweet_timestamp);
                holder.profileImage = (ImageView) convertView.findViewById(R.id.tweet_profile_image);
                convertView.setTag(holder);
            } else {
                holder = (TweetViewHolder) convertView.getTag();
                                
            }
            
            tweet = tweets.get(position);
            
            holder.message.setText( tweet.getMessage());
            holder.author.setText(tweet.getAuthor());
            holder.timestamp.setText( (new Date(tweet.getTimestamp())).toString());
            try {
            	imageDownloader.download(tweet.getUrl().toURI().toString(), holder.profileImage);
            } catch (Exception e) {
            
            }
            
            return convertView;
        }

    }
    
    private class TweetViewHolder {
        TextView message;
        TextView author;
        TextView timestamp;
        ImageView profileImage;
    }
      

}