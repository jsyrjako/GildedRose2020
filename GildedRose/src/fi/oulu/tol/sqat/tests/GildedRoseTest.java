package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {

	@Test
	public void testTheTruth() {
		assertTrue(true);
	}
	@Test
	public void exampleTest() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Dexterity Vest", 19, quality);
	}
	
	@Test
	public void TestAgedBrie() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 10, 30));
		inn.setItem(new Item("Aged Brie", 9, 50));
		inn.setItem(new Item("Aged Brie", -1, 10));
		inn.oneDay();
		
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality0 = items.get(0).getQuality();
		int quality1 = items.get(1).getQuality();
		int quality2 = items.get(2).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Aged Brie", 31, quality0);
		assertEquals("Failed quality for Aged Brie", 50, quality1);
		assertEquals("Failed quality for Aged Brie", 12, quality2);
	}
	
	@Test
	public void TestSulfuras() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 10, 80));
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 10, 80));
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 5, 80));
		inn.oneDay();
		
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality0 = items.get(0).getQuality();
		int quality1 = items.get(1).getQuality();
		int quality2 = items.get(2).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Sulfuras", 80, quality0);
		assertEquals("Failed quality for Sulfuras", 80, quality1);
		assertEquals("Failed quality for Sulfuras", 80, quality2);
	}
	
	@Test
	public void TestBackstagePasses() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 30));
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 50));
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", -1, 10));
		inn.oneDay();
		
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality0 = items.get(0).getQuality();
		int quality1 = items.get(1).getQuality();
		int quality2 = items.get(2).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Backstage passes", 32, quality0);
		assertEquals("Failed quality for Backstage passes", 50, quality1);
		assertEquals("Failed quality for Backstage passes", 0, quality2);
	}
	
	
	@Test
	public void TestMain() {
		// Test main
		GildedRose.main(null);
	}
	
	
	@Test
	public void TestFastQualityDegreade() {
		// Test 
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Elixir of the Mongoose", 0, 30));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Backstage passes", 28, quality);
	}
	
	
	
}