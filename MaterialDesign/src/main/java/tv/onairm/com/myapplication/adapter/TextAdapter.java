package tv.onairm.com.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tv.onairm.com.myapplication.R;

/**
 * Created by Edison on 2017/7/17.
 */

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.TextViewHolder>{
    @Override
    public TextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = View.inflate(parent.getContext(),R.layout.item_text,null);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        itemView.setLayoutParams(layoutParams);
        TextViewHolder viewHolder = new TextViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TextViewHolder holder, int position) {
        holder.tvText.setText("无花果"+position);
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    static class TextViewHolder extends RecyclerView.ViewHolder{
        TextView tvText;
        public TextViewHolder(View itemView) {
            super(itemView);
            tvText = (TextView) itemView.findViewById(R.id.tvText);
        }
    }
}
