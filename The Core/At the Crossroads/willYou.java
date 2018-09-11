boolean willYou(boolean young, boolean beautiful, boolean loved) {
    return ((young==true&&beautiful==true&&loved!=true)||((young!=true||beautiful!=true)&&loved==true))? true: false;
}

