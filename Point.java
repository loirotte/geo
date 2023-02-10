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
    Point(int a, int b)
    {
	x = a;
	y = b;
    }

    /**
     * Translater le point de dx et dy
     * @param dx translation en x
     * @param dy translation en y
     */
    void translation(int dx, int dy)
    {
	x += dx;
	y += dy;
    }
}
