/**
 * AndTinder v0.1 for Android
 *
 * @Author: Enrique López Mañas <eenriquelopez@gmail.com>
 * http://www.lopez-manas.com
 *
 * TAndTinder is a native library for Android that provide a
 * Tinder card like effect. A card can be constructed using an
 * image and displayed with animation effects, dismiss-to-like
 * and dismiss-to-unlike, and use different sorting mechanisms.
 *
 * AndTinder is compatible with API Level 13 and upwards
 *
 * @copyright: Enrique López Mañas
 * @license: Apache License 2.0
 */

package com.example.gamezop.ii;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.example.gamezop.ii.model.CardModel;
import com.example.gamezop.ii.view.CardContainer;
import com.example.gamezop.ii.view.SimpleCardStackAdapter;


public class MainActivity extends Activity {

    /**
     * This variable is the container that will host our cards
     */
	private CardContainer mCardContainer;
	String ss="A husband and wife are trying to set up a new password for their computer. The husband puts, Mypenis, and the wife falls on the ground laughing because on the screen it says, Error. Not long enough.";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.mainlayout);

		mCardContainer = (CardContainer) findViewById(R.id.layoutview);

		Resources r = getResources();

		SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(this);

		adapter.add(new CardModel(ss, "text", r.getDrawable(R.drawable.babyboy)));
		adapter.add(new CardModel(ss, "image", r.getDrawable(R.drawable.babyboy)));
		adapter.add(new CardModel(ss, "text", r.getDrawable(R.drawable.babyboy)));
		adapter.add(new CardModel(ss, "image", r.getDrawable(R.drawable.babyboy)));
		adapter.add(new CardModel(ss, "text", r.getDrawable(R.drawable.babyboy)));
		adapter.add(new CardModel(ss, "image", r.getDrawable(R.drawable.babyboy)));
		adapter.add(new CardModel(ss, "text", r.getDrawable(R.drawable.babyboy)));


        CardModel cardModel = new CardModel(ss, "Description goes here", r.getDrawable(R.drawable.babyboy));
        cardModel.setOnClickListener(new CardModel.OnClickListener() {
           @Override
           public void OnClickListener() {
               Log.i("Swipeable Cards","I am pressing the card");
           }
        });

        cardModel.setOnCardDismissedListener(new CardModel.OnCardDismissedListener() {
            @Override
            public void onLike() {
                Log.i("Swipeable Cards","I like the card");
            }

            @Override
            public void onDislike() {
                Log.i("Swipeable Cards","I dislike the card");
            }
        });

        adapter.add(cardModel);

		mCardContainer.setAdapter(adapter);
	}
	@Override
	public void onResume() {
		super.onResume();
		invalidateOptionsMenu();

			Activity currentActivity = this;
			currentActivity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			currentActivity.getWindow().setStatusBarColor((Color.parseColor("#00bcd4")));


	}
}
