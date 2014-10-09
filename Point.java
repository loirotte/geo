class Point {

    // Attributs de la classe point
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
    
    
    // Constructeur complet
    Point(int a, int o)
    {
	x = a;
	y = b;
    }
    
    void translation(int dx, int dy)
    {
	x += dx;
	y += dy;
    }
}
