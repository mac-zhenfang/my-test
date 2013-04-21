function map(){
    var name = this.name;
    if (name == "mac"){
        emit(this.name, 1);
    }
}