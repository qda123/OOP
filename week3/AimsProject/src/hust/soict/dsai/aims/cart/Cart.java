package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			
			System.out.println("The car is almost full!");
			
		}
		
		else {
			
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++;
			
			System.out.println("The disc has been added.");
			
		}
		
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
		
        for(DigitalVideoDisc disc: dvdList){
        	
            if(qtyOrdered <= MAX_NUMBERS_ORDERED){
            	
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered ++;
                System.out.println("The disc has been added");
                
            }
            
            else{
            	
                System.out.println("The cart is almost full");
                break;
                
            }
            
        }
        
    }
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
		
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
        
    }
	
	public float totalCost() {
		
		float totalCost = 0;
		
		for(int i = 0; i < qtyOrdered; i ++) {
			
			if(itemsOrdered[i] != null) {
				
				totalCost += itemsOrdered[i].getCost();
				
			}
			
		}
		
		return totalCost;
		
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
		if(qtyOrdered == 0) {
			
			System.out.println("The car is almost empty!");
			
		}
		
		else {
			
			for(int i = 0; i < qtyOrdered; i ++) {
				
				if(itemsOrdered[i].equals(disc)) {
					
					for(int j = i; i < qtyOrdered - 1; i ++) {
						
						itemsOrdered[j] = itemsOrdered[j + 1];
						
					}
					
				}
				
				itemsOrdered[qtyOrdered] = null;
				qtyOrdered --;
				
			}
			
			System.out.println("The disc has been removed.");
			
		}

	}
	
	public void print() {
		
        System.out.println("***********************CART***********************");
        
        for (int i = 0; i < qtyOrdered; i++) {
        	
            System.out.println(itemsOrdered[i].toString());
            
        }
        
        System.out.println("**************************************************");
        
    }

    public DigitalVideoDisc searchByID(int number) {
    	
        for (int i = 0; i < qtyOrdered; i++) {
        	
            if (itemsOrdered[i].getId() == number) {
            	
                System.out.println("Found: " + itemsOrdered[i].toString());
                return itemsOrdered[i];
                
            }
            
        }
        
        System.out.println("Item not found.");
        return null;
        
    }

    public DigitalVideoDisc searchByTitle(String keyword) {
    	
        for (int i = 0; i < qtyOrdered; i++) {
        	
            if (itemsOrdered[i].isMatch(keyword)) {
            	
                System.out.println("Found: " + itemsOrdered[i].toString());
                return itemsOrdered[i];
                
            }
            
        }
        
        System.out.println("Item not found.");
        return null;
        
    }
    
}