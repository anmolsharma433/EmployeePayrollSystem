package com.example.employeepayrollsystem;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.employeepayrollsystem.ModelClasses.EmployeeData;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class EmployeeRVAdapter extends RecyclerView.Adapter<EmployeeRVAdapter.ViewHolder> {
    private static final String TAG = "EmployeeRVAdapter";
    private ArrayList<EmployeeData> mEmpList = new ArrayList<>();
    private Context mContext;

    public EmployeeRVAdapter(ArrayList<EmployeeData> mImageName, Context mContext) {
        this.mEmpList = mImageName;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_layout_list_item,
                parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG,"onBindViewHolder: called");
        final EmployeeData myemp = mEmpList.get(position);
         holder.tv1.setText(myemp.getName());

         holder.rv1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent myintent = new Intent(mContext,EmpDetailsActivity.class);
                 myintent.putExtra("empobject",myemp);
                 mContext.startActivity(myintent);

//                 Toast.makeText(mContext, mEmpList.get(position).getEmployeeID(),Toast.LENGTH_SHORT).show();
             }
         });
    }

    @Override
    public int getItemCount() {
        return mEmpList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

       CircleImageView image;
       TextView tv1;
        RelativeLayout rv1;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        image= itemView.findViewById(R.id.firstImage);
        tv1 = itemView.findViewById(R.id.image_name);
        rv1 = itemView.findViewById(R.id.parent_layout);
    }
}
}
