package com.example.gamezop.ii.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by balram on 8/28/15.
 */
public class TextViewRobotoRegular extends TextView {
    public static Typeface FONT_NAME;


    public TextViewRobotoRegular(Context context) {
        super(context);
        if(FONT_NAME == null) FONT_NAME = Typeface.createFromAsset(context.getAssets(), "raleway_regular.ttf");
        this.setTypeface(FONT_NAME);
    }
    public TextViewRobotoRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        if(FONT_NAME == null) FONT_NAME = Typeface.createFromAsset(context.getAssets(), "raleway_regular.ttf");
        this.setTypeface(FONT_NAME);
    }
    public TextViewRobotoRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if(FONT_NAME == null) FONT_NAME = Typeface.createFromAsset(context.getAssets(), "raleway_regular.ttf");
        this.setTypeface(FONT_NAME);
    }
}