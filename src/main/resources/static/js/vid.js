

$(document).ready(function () {

    $('video').click(function () {
        if ($(this).hasClass('pause')) {
            $("video").trigger("play");
            $(this).removeClass('pause');
            $(this).addClass('play');
        } else {
            $("video").trigger("pause");
            $(this).removeClass('play');
            $(this).addClass('pause');
        }
    });

});



