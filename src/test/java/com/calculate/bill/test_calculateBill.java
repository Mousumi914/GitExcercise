package com.calculate.bill;


import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.calculate.bill.Customer;
import com.calculate.bill.Item;


@SuppressWarnings({ "deprecation", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class test_calculateBill {

			
			Customer c1;
			
			@Before
			public void setup(){
				c1=new Customer();
				c1.setName("John");
				List<Item> listOfItems=new ArrayList<Item>();
				Item i1=Mockito.mock(Item.class);
				Item i2=Mockito.mock(Item.class);
				Item i3=Mockito.mock(Item.class);
				listOfItems.add(i1);
				listOfItems.add(i2);
				listOfItems.add(i3);
				
				c1.setListOfItems(listOfItems);
				when(i1.getName()).thenReturn("Rice");
				when(i2.getName()).thenReturn("Tea");
				when(i3.getName()).thenReturn("Wheat");
				when(i1.getPrice("Rice")).thenReturn(100);
				when(i2.getPrice("Tea")).thenReturn(200);
				when(i3.getPrice("Wheat")).thenReturn(300);
				
			}
			@Test
			public void test_Customer_CalculateBill()  
			{

			Assert.assertEquals(600, c1.calculateBill());
			}
			
		
			
	}
 


