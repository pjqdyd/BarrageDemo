
$(document).ready(function () {

        var button = $("#button");
        var inputBox = $(".inpu-box");

        //输入框获取焦点的事件/删除提示字
        inputBox.focus(function () {
            $(this).find("p").remove();
        });

        // 点击发送按钮后
        button.click(function () {
            var text = $(".inpu-box").text(); //拿到输入框的文本信息
            websocket.send(text);
        });
        //或者输入框按下回车按钮后
        inputBox.keypress(function (event) {
            if(event.which == 13){
                event.preventDefault(); //给回车事件一个默认函数,防止自动换行
                var text = $(".inpu-box").text(); //拿到输入框的文本信息
                websocket.send(text);
            }
        });
    }
);