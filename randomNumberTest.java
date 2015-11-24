/*
 * randomNumberTest.java
 * 
 * Copyright 2015 BS <bs@bsZ>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
 
class RandomNumber{
	public static int number(int x, int y){
		int low;
		int high;
		int thenumber;
		if (x == y) {
			return x;
		} else {
			if (x > y) {
				low = y;
				high = x;
			} else {
				low = x;
				high = y;
			};
		};
		thenumber = (int) ((high - low) * Math.random() + low) ;
		return thenumber;
	}
}

public class RandomNumberTest{
	public static void main (String args[]){
		int low = 5;
		int high = 10;
		RandomNumber t = new RandomNumber();
		int n = t.number(low, high);
		System.out.println(" Zufallsnummer is " + n);
	}
}
