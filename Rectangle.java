class Rectangle {

    //Attributs
    Point coin;
    int largeur, hauteur;

    //Constructeur par défaut
    Rectangle()
    {
        coin = new Point();
        largeur = 0;
        hauteur = 0;
    }

    //Constructeur complet
    Rectangle(Point cig, int l, int h)
    {
        coin = new Point(cig);
        largeur = l;
        hauteur = h;
    }

    //Constructeur complet
    Rectangle(int x, int y, int l, int h)
    {
        coin = new Point(x, y);
        largeur = l;
        hauteur = h;
    }

    //Constructeur de copie
    Rectangle(Rectangle r) {
        coin = new Point(r.coin);
        largeur = r.largeur;
        hauteur = r.hauteur;
    }

    //Translater le rectangle de dx et dy
    void translation(int dx, int dy) {
        coin.translation(dx, dy);
    }

    //Set la largeur
    void modifieLargeur(int dl) {
        largeur = dl;
    }

    //Set la hauteur
    void modifieHauteur(int dh) {
        hauteur = dh;
    }
}
