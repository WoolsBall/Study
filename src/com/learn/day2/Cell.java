package com.learn.day2;

public class Cell {
	int row;
	int col;
	
	public Cell(){
		this(0,0);
	}
	
	public Cell(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
	
	public Cell(Cell cell){
		this(cell.row,cell.col);
	}
	
	public void drop() {
        row++;
    }
    public void moveRight() {
        col++;
    }
    public void moveLeft() {
        col--;
    }

	@Override
	public String toString() {
		
		return row+","+col;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj==null) {
			return false;
		}
		if(this==obj){
			return true;
		}
		if(obj instanceof Cell){
			Cell cell=(Cell)obj;
			return cell.row==row&&cell.col==col;
		}else{
			return false;
		}
		
	}
    
    

}
