package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint paint = new Paint();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);

        RectF rectF = new RectF(300,300,600,500);

        canvas.drawArc(rectF,190,50,false,paint);

        paint.setStyle(Paint.Style.FILL);
        //canvas.drawArc(rectF,250,100,true,paint);
        canvas.drawArc(rectF,350,-100,true,paint);

        RectF rectF2 = new RectF(300,400,600,600);
        canvas.drawArc(rectF2,0,180,false,paint);

    }
}
