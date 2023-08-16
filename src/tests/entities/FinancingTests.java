package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void ConstructorShouldCreateObjectWithTheCorrectDataWhenTheIsValidData(){
		
		double totalAmount = 100000.0;
		double income = 2000.0;
		Integer mounths = 80;
		
		Financing fc = new Financing(totalAmount, income, mounths);		
		
		Assertions.assertEquals(totalAmount, fc.getTotalAmount());
		Assertions.assertEquals(income, fc.getIncome());
		Assertions.assertEquals(mounths, fc.getMonths());
	}
	
	@Test
	public void ConstructorShouldCreateObjectWithTheCorrectDataWhenTheInValidData(){
		
		double totalAmount = 100000.0;
		double income = 2000.0;
		Integer mounths = 80;
		
		Financing fc = new Financing(totalAmount, income, mounths);		
		
		Assertions.assertEquals(totalAmount, fc.getTotalAmount());
		Assertions.assertEquals(income, fc.getIncome());
		Assertions.assertEquals(mounths, fc.getMonths());
	}
		
	@Test
	public void SetTotalAmountShouldCreateObjectWithTheCorrectDataWhenTheIsValidData(){
		
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			double totalAmount = 100000.0;
			double income = 2000.0;
			Integer mounths = 20;
			
			Financing fc = new Financing(totalAmount, income, mounths);
			
			Assertions.assertEquals(totalAmount, fc.getTotalAmount());
			Assertions.assertEquals(income, fc.getIncome());
			Assertions.assertEquals(mounths, fc.getMonths());
			
		});	
	}
	
	@Test
	public void SetTotalAmountShouldReturnIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			double totalAmount = 100000.0;
			double income = 2000.0;
			Integer mounths = 80;
			
			Financing fc = new Financing(totalAmount, income, mounths);
			
			fc.setTotalAmount(110000.0);
			
		});	
	}
	
	@Test
	public void SetIncomeShouldCreateObjectWithTheCorrectDataWhenTheIsValidData(){
		
		double totalAmount = 100000.0;
		double income = 2000.0;
		Integer mounths = 80;
		
		Financing fc = new Financing(totalAmount, income, mounths);		
		
		fc.setIncome(2100.0);
		
		Assertions.assertEquals(2100.0, fc.getIncome());
	}
	
	@Test
	public void SetIncomeShouldReturnIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			double totalAmount = 100000.0;
			double income = 2000.0;
			Integer mounths = 80;
			
			Financing fc = new Financing(totalAmount, income, mounths);
			
			fc.setIncome(1900.0);
			
		});	
	}
	
	@Test
	public void SetMonthsShouldReturnIllegalArgumentExceptionWhenIsvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			double totalAmount = 100000.0;
			double income = 2000.0;
			Integer mounths = 80;
			
			Financing fc = new Financing(totalAmount, income, mounths);
			
			fc.setMonths(79);
			
		});
	}	
	
	@Test
	public void EntryCorrectlyCalculateTheInputValue() {
		
		double totalAmount = 100000.0;
		double income = 2000.0;
		Integer mounths = 80;
		
		Financing fc = new Financing(totalAmount, income, mounths);
		
		Assertions.assertEquals(20000.0, fc.entry());
		
	}
	
	@Test
	public void QuotaCorrectlyCalculateTheInstalmentValue() {
		
		double totalAmount = 100000.0;
		double income = 2000.0;
		Integer mounths = 80;
		
		Financing fc = new Financing(totalAmount, income, mounths);
		
		Assertions.assertEquals(1000.0, fc.quota());
		
	}
}
