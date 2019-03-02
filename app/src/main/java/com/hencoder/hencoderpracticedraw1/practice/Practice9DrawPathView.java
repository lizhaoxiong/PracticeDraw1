package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private Paint paint = new Paint();


    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形


        paint.setStrokeWidth(6);
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        int width = getWidth();
        int height = getHeight();

        // 绘制心形
        Path path = new Path();
        path.moveTo(width/2,height/3);
        path.cubicTo((width*2)/3,height/9,(width*12)/13,(height*2)/5,width/2,(height*7)/8);
        canvas.drawPath(path,paint);

        Path path2 = new Path();
        path2.moveTo(width/2,height/3);
        path2.cubicTo(width / 3, height / 9, width / 13, (height * 2) / 5, width / 2, (height * 7) / 8);
        canvas.drawPath(path2,paint);
    }
}
