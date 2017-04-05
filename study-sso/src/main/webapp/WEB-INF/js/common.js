//获取cookie
function getCookie(name){
	var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
	if(arr=document.cookie.match(reg))
		return unescape(arr[2]);
	else
		return null;
}
//设置延时millis(毫秒)
function sleep(millis){
	var now = new Date();
	var exit = now.getTime() + millis;
	while(true){
		now = new Date();
		if(now.getTime()>exit){
			return;
		}
	}
}