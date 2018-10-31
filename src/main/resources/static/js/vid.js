

$(document).ready(function () {

    $('video').click(function () {
        if ($(this).hasClass('pause')) {
            $("video").trigger("play");
        } else {
            $("video").trigger("pause");
        }
    });

});



