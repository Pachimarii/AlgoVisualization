package example;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;

public class Main {
public static void main( String[] args) {
		
	EventQueue.invokeLater(()->{
		AlgoFrame frame = new AlgoFrame("welcome",500,500);
//		AlgoFrame frame = new AlgoFrame("welcome");
	});
		
}
}
