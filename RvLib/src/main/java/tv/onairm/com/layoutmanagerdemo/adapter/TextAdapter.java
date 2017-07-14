package tv.onairm.com.layoutmanagerdemo.adapter;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import tv.onairm.com.layoutmanagerdemo.R;
import tv.onairm.com.layoutmanagerdemo.study.RecyclerView;

/**
 * Created by Edison on 2017/7/13.
 */

public class TextAdapter extends RecyclerView.Adapter<TextViewHolder> {
    public String TAG = getClass().getSimpleName();
    public static int count = 0;
    @Override
    public TextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.e(TAG, "onCreateViewHolder: "+(++count));
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                , ViewGroup.LayoutParams.WRAP_CONTENT);
        View itemView = View.inflate(parent.getContext(), R.layout.item_text,null);
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
        return 500;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}
