package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice10HistogramView extends View {

  Paint paint = new Paint();

  public Practice10HistogramView(Context context) {
    super(context);
  }

  public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        综合练习
    //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(2);
    paint.setColor(Color.WHITE);

    final int width = getWidth();
    final int height = getHeight();
    final int space = 20;
    final int lenght = 50;
    int leftX = width / 10 - lenght;
    int leftY = 0;


    float[] drawLines = {
        width / 10, height * 3 / 4, width / 10, height / 20, width / 10, height * 3 / 4,
        width * 9 / 10, height * 3 / 4
    };

    canvas.drawLines(drawLines, paint);
    paint.setColor(Color.BLUE);
    paint.setStyle(Paint.Style.FILL);
    ArrayList listH = new ArrayList(Arrays.asList(height/3, height/10, height/5, height/2, height/4, height/3));
    for (Object s : listH) {
      int h = (int)s;
      leftX =  lenght + space + leftX;
      leftY = height * 3 / 4 - h;

      int rightX = leftX + lenght;
      int rightY = height * 3 / 4;

      canvas.drawRect(leftX,leftY,rightX,rightY,paint);
    }
  }
}
