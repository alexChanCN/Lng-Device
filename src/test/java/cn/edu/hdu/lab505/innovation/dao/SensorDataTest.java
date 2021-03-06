package cn.edu.hdu.lab505.innovation.dao;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.hdu.lab505.innovation.domain.SensorData;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SensorDataTest {

	@Autowired
	private ISensorDataDao dao;
	
	@Test
	public void test() {
		//String dateString = "2016-12-04";
		int productId = 1;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Calendar ca = Calendar.getInstance();
		ca.set(2016, 11, 4);
		Date date = ca.getTime();
		System.out.println("date: " + ca.getTime());
		List<SensorData> sd = dao.findByProductIdAndDate(date, productId);
		for(SensorData s : sd)
			System.out.println(s.getProductId());
	}

}
