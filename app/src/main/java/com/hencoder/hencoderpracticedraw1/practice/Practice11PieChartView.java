package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint paint = new Paint();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int width = getWidth();
        int heigth = getHeight();

        paint.setStyle(Paint.Style.FILL);

        RectF rectF = new RectF(width/4,heigth/4,width*3/4,heigth*3/4);

        canvas.drawArc(rectF,180,120,true,paint);

        paint.setColor(Color.RED);
        canvas.drawArc(rectF,300,50,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF,350,80,true,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF,430,60,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(rectF,490,50,true,paint);
    }
}
