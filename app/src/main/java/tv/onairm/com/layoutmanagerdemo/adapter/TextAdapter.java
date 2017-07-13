package tv.onairm.com.layoutmanagerdemo.adapter;

import android.view.View;
import android.view.ViewGroup;

import tv.onairm.com.layoutmanagerdemo.R;
import tv.onairm.com.layoutmanagerdemo.study.RecyclerView;

/**
 * Created by Edison on 2017/7/13.
 */

public class TextAdapter extends RecyclerView.Adapter<TextViewHolder> {
    @Override
    public TextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                ,ViewGroup.LayoutParams.WRAP_CONTENT);
        View itemView = View.inflate(parent.getContext(), R.layout.item_text,null);
        itemView.setLayoutParams(layoutParams);
        TextViewHolder viewHolder = new TextViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TextViewHolder holder, int position) {
        holder.tvText.setText("无花果"+position);
       /* holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }

    @Override
    public int getItemCount() {
        return 1000;
    }
}
