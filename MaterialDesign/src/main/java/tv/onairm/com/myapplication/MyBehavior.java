package tv.onairm.com.myapplication;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Edison on 2017/7/17.
 */

public class MyBehavior extends CoordinatorLayout.Behavior<TextView> {//这里的泛型是child的类型，也就是观察者View
    public MyBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, TextView child, View dependency) {
        //告知监听的dependency是Button
        return dependency instanceof Button;
    }

    @Override
    //当 dependency(Button)变化的时候，可以对child(TextView)进行操作
    public boolean onDependentViewChanged(CoordinatorLayout parent, TextView child, View dependency) {
        child.setX(dependency.getX()+200);
        child.setY(dependency.getY()+200);
        child.setText(dependency.getX()+","+dependency.getY());

        return true;
    }
}