/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tv.onairm.com.layoutmanagerdemo.study.helper;

import android.graphics.Canvas;
import android.view.View;

import tv.onairm.com.layoutmanagerdemo.study.RecyclerView;

/**
 * Utility class for {@link android.support.v7.widget.helper.ItemTouchHelper} which handles item transformations for different
 * API versions.
 * <p/>
 * This class has methods that map to {@link android.support.v7.widget.helper.ItemTouchHelper.Callback}'s drawing methods. Default
 * implementations in {@link android.support.v7.widget.helper.ItemTouchHelper.Callback} call these methods with
 * {@link RecyclerView.ViewHolder#itemView} and {@link ItemTouchUIUtil} makes necessary changes
 * on the View depending on the API level. You can access the instance of {@link ItemTouchUIUtil}
 * via {@link android.support.v7.widget.helper.ItemTouchHelper.Callback#getDefaultUIUtil()} and call its methods with the children
 * of ViewHolder that you want to apply default effects.
 *
 * @see android.support.v7.widget.helper.ItemTouchHelper.Callback#getDefaultUIUtil()
 */
public interface ItemTouchUIUtil {

    void onDraw(Canvas c, RecyclerView recyclerView, View view,
                float dX, float dY, int actionState, boolean isCurrentlyActive);

    void onDrawOver(Canvas c, RecyclerView recyclerView, View view,
                    float dX, float dY, int actionState, boolean isCurrentlyActive);

    void clearView(View view);

    void onSelected(View view);
}

