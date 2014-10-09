class Point {
    int x, y;

    // Constructeur par défaut
    Point()
    {
	x = 0;
	y = 0;
    }

    // Constructeur de copie
    Point(Point p)
    {
	x = p.x;
	y = p.y;
    }
    
    
    Point(int a, int o)
    {
    }
    
    void translation(int dx, int dy)
    {
	x += dx;
	y += dy;
    }
}
