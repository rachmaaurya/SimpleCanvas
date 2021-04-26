package com.example.simplecanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Rectangle;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Paint mPaintText = new Paint(Paint.UNDERLINE_TEXT_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.my_imageview);
        mPaint.setColor(Color.YELLOW);
        mPaintText.setColor(ResourcesCompat.getColor(getResources(),
                R.color.black, null));
        mPaintText.setTextSize(60);
    }

    public void drawSomething(View view) {
        int vWitdh = view.getWidth();
        int vHeight = view.getHeight();
        mBitmap = Bitmap.createBitmap(vWitdh, vHeight, Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas = new Canvas (mBitmap);
        mCanvas.drawColor(Color.GREEN);
        //mCanvas.drawText("HELLO WORLD", 50, 50, mPaintText);

        /**mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(100, 100, 300,200, mPaint);*/

        /**mPaint.setColor(Color.RED);
        Rect mRect = new Rect();
        mRect.set(100, 200, 500,400);
        mCanvas.drawRect(mRect, mPaint);
        mPaint.setColor(Color.YELLOW);*/

        //mCanvas.drawCircle(200, 500, 100, mPaint);

        mPaint.setColor(Color.GREEN);

        Path path = new Path();
        path.moveTo(150, 250);
        path.lineTo(350, 150);
        path.lineTo(550, 250);
        //path.lineTo(700, 800);
        mPaint.setColor(Color.BLUE);
        mCanvas.drawPath(path, mPaint);

        mPaint.setColor(Color.MAGENTA);
        Rect mRect = new Rect();
        mRect.set(150, 250, 550,450);
        mCanvas.drawRect(mRect, mPaint);

        mPaint.setColor(Color.DKGRAY);
        mRect.set(300, 350, 400,450);
        mCanvas.drawRect(mRect, mPaint);

        mCanvas.drawText("Rachma Aurya Nurhaliza", 50, 600, mPaintText);

        view.invalidate();
    }
}