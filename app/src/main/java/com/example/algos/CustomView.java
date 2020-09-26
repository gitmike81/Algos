package com.example.algos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CustomView extends View {


    // defines paint and canvas
    private Paint drawPaint;

    private Canvas canvas;

    public CustomView(Context context) {
        super(context);
        Log.i("MyLog", "CustomView 1st Constructor");
    }

    public CustomView(Context context, AttributeSet attrs){
        super(context, attrs);
        setupPaint();
    }

    // Setup paint with color and stroke styles
    private void setupPaint() {
        drawPaint = new Paint();
        drawPaint.setColor(Color.BLUE);
        drawPaint.setAntiAlias(true);
        drawPaint.setStrokeWidth(5);
        drawPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    protected void onDraw(Canvas c){
        this.canvas = c;
        canvas.drawColor(Color.CYAN);
        canvas.drawCircle(5,5,5,drawPaint);
    }

}
