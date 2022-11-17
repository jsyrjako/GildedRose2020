package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {
	private final PrintStream sysOutput = System.out;
	private final ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
	

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
	public void TestMain() {
		// Test main
		  System.setOut(new PrintStream(byteOutputStream));

	      GildedRose.main(null);
	      assertEquals("OMGHAI!", byteOutputStream.toString().trim());

	      System.setOut(sysOutput);
	}
	
	
	@Test
	public void TestAgedBrie() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 10, 30));
		inn.setItem(new Item("Aged Brie", 11, 50));
		inn.setItem(new Item("Aged Brie", -1, 40));
		inn.setItem(new Item("Aged Brie", -1, 55));
		inn.oneDay();
		
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality0 = items.get(0).getQuality();
		int quality1 = items.get(1).getQuality();
		int quality2 = items.get(2).getQuality();
		int quality3 = items.get(3).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Aged Brie", 31, quality0);
		assertEquals("Failed quality for Aged Brie", 50, quality1);
		assertEquals("Failed quality for Aged Brie", 42, quality2);
		assertEquals("Failed quality for Aged Brie", 55, quality3);
	}
	
	@Test
	public void TestSulfuras() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 10, 80));
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", -1, 80));
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 5, 80));
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		inn.oneDay();
		
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality0 = items.get(0).getQuality();
		int quality1 = items.get(1).getQuality();
		int quality2 = items.get(2).getQuality();
		int quality3 = items.get(3).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Sulfuras", 80, quality0);
		assertEquals("Failed quality for Sulfuras", 80, quality1);
		assertEquals("Failed quality for Sulfuras", 80, quality2);
		assertEquals("Failed quality for Sulfuras", 80, quality3);
	}
	
	@Test
	public void TestBackstagePasses() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", -1, 55));
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 3, 55));
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 55));
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 11, 40));
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 6, 20));
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49));
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49));
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 3, -1));
		inn.oneDay();
		
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality0 = items.get(0).getQuality();
		int quality1 = items.get(1).getQuality();
		int quality2 = items.get(2).getQuality();
		int quality3 = items.get(3).getQuality();
		int quality4 = items.get(4).getQuality();
		int quality5 = items.get(5).getQuality();
		int quality6 = items.get(6).getQuality();
		int quality7 = items.get(7).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Backstage passes", 0, quality0);
		assertEquals("Failed quality for Backstage passes", 55, quality1);
		assertEquals("Failed quality for Backstage passes", 55, quality2);
		assertEquals("Failed quality for Backstage passes", 41, quality3);
		assertEquals("Failed quality for Backstage passes", 22, quality4);
		assertEquals("Failed quality for Backstage passes", 50, quality5);
		assertEquals("Failed quality for Backstage passes", 50, quality6);
		assertEquals("Failed quality for Backstage passes", 2, quality7);
	}
	
	
	@Test
	public void TestMongoose() {
		// Test 
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Elixir of the Mongoose", 30, 30));
		inn.setItem(new Item("Elixir of the Mongoose", -5, 10));
		inn.setItem(new Item("Elixir of the Mongoose", 10, -1));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality0 = items.get(0).getQuality();
		int quality1 = items.get(1).getQuality();
		int quality2 = items.get(2).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Elixir of the Mongoose", 29, quality0);
		assertEquals("Failed quality for Elixir of the Mongoose", 8, quality1);
		assertEquals("Failed quality for Elixir of the Mongoose", -1, quality2);
	}
	
	
	@Test
	public void TestManaCakee() {
		// Test 
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cakee", -1, 49));
		inn.setItem(new Item("Conjured Mana Cake", -1, 10));
		inn.setItem(new Item("Conjured Mana Cake", -1, -1));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality0 = items.get(0).getQuality();
		int quality1 = items.get(1).getQuality();
		int quality2 = items.get(2).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Conjured Mana Cake", 47, quality0);
		assertEquals("Failed quality for Conjured Mana Cake", 8, quality1);
		assertEquals("Failed quality for Conjured Mana Cake", -1, quality2);
	}
	
	
	@Test
	public void TestManaCakee2() {
		// Test 
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cake", -1, 0));
		inn.setItem(new Item("Conjured Mana Cake", -1, -1));
		inn.setItem(new Item("Conjured Mana Cake", 0, 30));
		inn.setItem(new Item("Conjured Mana Cake", 0, 50));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality0 = items.get(0).getQuality();
		int quality1 = items.get(1).getQuality();
		int quality2 = items.get(2).getQuality();
		int quality3 = items.get(3).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Conjured Mana Cake", 0, quality0);
		assertEquals("Failed quality for Conjured Mana Cake", -1, quality1);
		assertEquals("Failed quality for Conjured Mana Cake", 28, quality2);
		assertEquals("Failed quality for Conjured Mana Cake", 48, quality3);
	}
	
	
	
	
}