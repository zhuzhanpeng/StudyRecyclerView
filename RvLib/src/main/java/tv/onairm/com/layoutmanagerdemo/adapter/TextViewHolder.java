package tv.onairm.com.layoutmanagerdemo.adapter;

import android.view.View;
import android.widget.TextView;

import tv.onairm.com.layoutmanagerdemo.R;
import tv.onairm.com.layoutmanagerdemo.study.RecyclerView;

/**
 * Created by Edison on 2017/7/13.
 */

public class TextViewHolder extends RecyclerView.ViewHolder {
    TextView tvText;
    public TextViewHolder(View itemView) {
        super(itemView);
        tvText = (TextView) itemView.findViewById(R.id.tvText);
    }
}
