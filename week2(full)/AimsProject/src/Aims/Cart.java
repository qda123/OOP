package Aims;

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
}