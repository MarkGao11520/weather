/**
 * Created by gaowenfeng on 2017/5/23.
 */
(function getProvince() {
    $.ajax({
        type: "get",
        url: "getProvince",
        success: function (result) {
            writeProvince(result);
            getCity();
        }
    })
})();


function getCity() {
    $.ajax({
        type: "get",
        url: "getCity",
        data:{
            province:$('#provinceS').val()
        },
        success: function (result) {
            writeCity(result);
        }
    })
}

function writeProvince(list) {
    var str = "<select id='provinceS'>";
    for (var i = 0; i < list.length; i++) {
        str += "<option>" + list[i] + "</option>";
    }
    str += "</select>&nbsp;";
    $('#province').html(str);
    document.getElementById("provinceS").addEventListener('change',provinceSelect);
}

function writeCity(list) {
    var str = "<select id='cityS'>";
    for (var i = 0; i < list.length; i++) {
        str += "<option>" + list[i] + "</option>";
    }
    str += "</select>&nbsp;";
    $('#city').html(str);
}

function provinceSelect() {
    getCity();
}

function search() {
    $.ajax({
        type: "get",
        url: "getWeather",
        data:{
            city:$('#cityS').val().substring(0,$('#cityS').val().indexOf('('))
        },
        success: function (result) {
            var str = "<br><br>";
            for(var i=0;i<result.length;i++){
                str+=result[i]+'</br>';
            }
            $('#result').html(str);
        }
    })
}