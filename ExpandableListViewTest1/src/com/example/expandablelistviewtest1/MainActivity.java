package com.example.expandablelistviewtest1;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class MainActivity extends Activity {

	private ExpandableListView mListView;
	private MyAdapter adapter;
	private List<GroupBean> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//初始化数据
		initData();
		mListView = (ExpandableListView) this.findViewById(R.id.my_listview);
		adapter = new MyAdapter(list, this);
		mListView.setAdapter(adapter);
		mListView.setGroupIndicator(null);
//		mListView.expandGroup(0);
	}

	private void initData() {
		list = new ArrayList<GroupBean>();
		{
			List<ChildBean> list1 = new ArrayList<ChildBean>();
			ChildBean cb1 = new ChildBean("妈妈", "123");
			ChildBean cb2 = new ChildBean("爸爸", "456");
			ChildBean cb3 = new ChildBean("爷爷", "789");
			ChildBean cb4 = new ChildBean("妹妹", "000");
			list1.add(cb1);
			list1.add(cb2);
			list1.add(cb3);
			list1.add(cb4);
			GroupBean gb1 = new GroupBean("家", list1);
			list.add(gb1);
		}
		{
			List<ChildBean> list1 = new ArrayList<ChildBean>();
			ChildBean cb1 = new ChildBean("张三", "123");
			ChildBean cb2 = new ChildBean("李四", "456");
			ChildBean cb3 = new ChildBean("王五", "789");
			ChildBean cb4 = new ChildBean("赵六", "000");
			ChildBean cb5 = new ChildBean("风起", "1111");
			ChildBean cb6 = new ChildBean("马坝", "222");
			ChildBean cb7 = new ChildBean("迁就", "3333333");
			list1.add(cb1);
			list1.add(cb2);
			list1.add(cb3);
			list1.add(cb4);
			list1.add(cb5);
			list1.add(cb6);
			list1.add(cb7);
			GroupBean gb1 = new GroupBean("我的朋友", list1);
			list.add(gb1);
		}
		{
			List<ChildBean> list1 = new ArrayList<ChildBean>();
			ChildBean cb1 = new ChildBean("Tom", "123");
			ChildBean cb2 = new ChildBean("Jerry", "456");
			ChildBean cb4 = new ChildBean("Bush", "000");
			list1.add(cb1);
			list1.add(cb2);
			list1.add(cb4);
			GroupBean gb1 = new GroupBean("国际友人", list1);
			list.add(gb1);
		}
		{
			List<ChildBean> list1 = new ArrayList<ChildBean>();
			ChildBean cb1 = new ChildBean("赵工", "123");
			ChildBean cb2 = new ChildBean("马工", "456");
			ChildBean cb3 = new ChildBean("王工", "789");
			ChildBean cb4 = new ChildBean("李工", "000");
			ChildBean cb5 = new ChildBean("为工", "000");
			list1.add(cb1);
			list1.add(cb2);
			list1.add(cb3);
			list1.add(cb4);
			list1.add(cb5);
			GroupBean gb1 = new GroupBean("同事", list1);
			list.add(gb1);
		}
	}
}
