package com.example.sy_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LvActivity extends AppCompatActivity {
    private ListView lv_data;
    private List<Goods> listData = new ArrayList<Goods>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv);

        initData();

        lv_data = findViewById(R.id.lv_data);
        //设置适配器
        MyListDataAdapter adapter = new MyListDataAdapter();
        lv_data.setAdapter(adapter);
    }

    private void initData(){
        listData = new ArrayList<Goods>();
        listData.add(new Goods("1","联想","510947","-"));
        listData.add(new Goods("2","戴尔","225193","-"));
        listData.add(new Goods("3","华硕","222513","-"));
        listData.add(new Goods("4","苹果","181891","-"));
        listData.add(new Goods("5","惠普","91470","-"));
        listData.add(new Goods("6","宏基","72139","-"));
        listData.add(new Goods("7","索尼","64158","-"));
        listData.add(new Goods("8","三星","52514","-"));
        listData.add(new Goods("9","神州","35647","-"));
        listData.add(new Goods("10","东芝","20994","-"));

    }

    class MyListDataAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return listData.size();
        }

        @Override
        public Object getItem(int position) {
            return listData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertview, ViewGroup viewGroup) {
            MyListViewHolder holder;

            if(convertview==null){
                convertview = View.inflate(LvActivity.this,R.layout.list_item,null);
                holder = new MyListViewHolder();
                holder.paiming = convertview.findViewById(R.id.paiming);
                holder.name = convertview.findViewById(R.id.name);
                holder.number = convertview.findViewById(R.id.number);
                holder.gang = convertview.findViewById(R.id.gang);

                convertview.setTag(holder);
            }else {
                holder = (MyListViewHolder) convertview.getTag();
            }
            Goods obj = listData.get(position);
            holder.paiming.setText(obj.getPaiming());
            holder.name.setText(obj.getName());
            holder.number.setText(obj.getNumber());
            holder.gang.setText(obj.getGang());

            return convertview;
        }

        class MyListViewHolder{
            TextView paiming,name,number,gang;
        }
    }
}