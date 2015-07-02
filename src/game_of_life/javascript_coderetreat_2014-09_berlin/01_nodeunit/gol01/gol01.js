var gol = {};
gol.create = function(neighbor){
    this.neighbor = neighbor;
    this.is_alive = true
}

gol.next = function(){
    this.is_alive = (this.neighbor <= 2)
}

gol.number_of_neighbors = function(){
    return this.neighbor;
}

gol.isalive = function(){
    return this.is_alive;
}


this.gol01 = {
    'test_for_no_element': function (test) {
        //given
        gol.create(0);
        //when
        gol.next();
        var number_of_neighbors = gol.number_of_neighbors();
        //then
        test.ok(isalive(), 'test_for_no_element');
        setTimeout(function () {
            test.done();
        }, 10);
    },
     'test_for_one_element': function (test) {
        //given
        gol.create(1);
        //when
        gol.next();
        var number_of_neighbors = gol.number_of_neighbors();
        //then
        test.ok(isalive(), 'test_for_one_element');
        setTimeout(function () {
            test.done();
        }, 10);
    }
};
