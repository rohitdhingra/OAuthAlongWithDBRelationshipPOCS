package com.javasampleapproach.springbatch.step;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> messages) throws Exception {
		// TODO Auto-generated method stub
		for(String msg:messages)
		{
			System.out.println("#Writer Step:"+msg);
		}
	}

}
