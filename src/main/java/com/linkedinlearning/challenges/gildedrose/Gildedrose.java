package com.linkedinlearning.challenges.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {

      // Backstage Passes:
      // sellIn <= 10, quality +2
      // sellIn <= 5, quality +3
      // sellIn <= 0, quality 0

      // Aged brie:
      // sellIn --, quality ++

      // Sulfuras:
      // sellIn = null, quality

      // Normal items pro Tag:
      // sellIn --, quality--
      // sellIn <= 0, quality -2 (doppelt so schneller Verfall)
      // quality kann nicht negativ sein: quality >= 0 && <= 50

      // TODO:
      // Conjured items:
      // verlieren quality doppelt so schnell
      
      if (items[i].name.contains("Conjured")) {
        items[i].sellIn--;
        items[i].quality -= 2;
        continue;
      }

      if (!items[i].name.equals("Aged Brie")
          && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (items[i].quality > 0) {
          if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            items[i].quality = items[i].quality - 1;
          }
        }
      } else {
        if (items[i].quality < 50) {
          items[i].quality = items[i].quality + 1;

          if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (items[i].sellIn < 11) {
              if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
              }
            }

            if (items[i].sellIn < 6) {
              if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
              }
            }
          }
        }
      }

      if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        items[i].sellIn = items[i].sellIn - 1;
      }

      if (items[i].sellIn < 0) {
        if (!items[i].name.equals("Aged Brie")) {
          if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (items[i].quality > 0) {
              if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].quality = items[i].quality - 1;
              }
            }
          } else {
            items[i].quality = items[i].quality - items[i].quality;
          }
        } else {
          if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
          }
        }
      }
    }
  }
}