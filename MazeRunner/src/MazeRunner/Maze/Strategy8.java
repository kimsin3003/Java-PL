package MazeRunner.Maze;

public class Strategy8 implements Strategy{


	@Override
	public Point getNextPos(Point curPos) {
				
		Point nextPos = new Point();
		switch (curPos.nextDir){
		case 0: 
			nextPos.x = curPos.x;
			nextPos.y = curPos.y - 1;
			curPos.nextDir++;
			break;
			
		case 1:
			nextPos.x = curPos.x + 1;
			nextPos.y = curPos.y - 1;
			curPos.nextDir++;
			break;
			
		case 2:
			nextPos.x = curPos.x + 1;
			nextPos.y = curPos.y;
			curPos.nextDir++;
			break;
			
		case 3:
			nextPos.x = curPos.x + 1;
			nextPos.y = curPos.y + 1;
			curPos.nextDir++;
			break;
			
		case 4:
			nextPos.x = curPos.x;
			nextPos.y = curPos.y + 1;
			curPos.nextDir++;
			break;
			
		case 5:
			nextPos.x = curPos.x - 1;
			nextPos.y = curPos.y + 1;
			curPos.nextDir++;
			break;
			
		case 6:
			nextPos.x = curPos.x - 1;
			nextPos.y = curPos.y;
			curPos.nextDir++;
			break;
			
		case 7:
			nextPos.x = curPos.x - 1;
			nextPos.y = curPos.y - 1;
			curPos.nextDir++;
			break;
	
		case 8:
			curPos.nextDir = -1;
		}
			
		
		return nextPos;
	}

}
