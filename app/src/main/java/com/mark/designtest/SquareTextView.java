package com.mark.designtest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class SquareTextView extends androidx.appcompat.widget.AppCompatTextView {

    public SquareTextView(Context context) {
        this(context, null);
    }
    public SquareTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public SquareTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();
        //setMeasuredDimension(width, width);
    }


}
