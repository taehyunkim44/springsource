/**
 * changePwd.jsp
 */
$(function(e){
	//변경 버튼 클릭시 폼에 있는 데이터를 비동기식으로 전달
	$('.btn-primary').click(function(e){
		//submit 중지
		e.preventDefault();
		
		//입력 데이터 자바스크립트 객체로 생성
		let param={
			userid:'eeee',
			confirm_password:$("#confirm_password").val()
		}
		
		//ajax 통신
		$.ajax({
			url:'eeee',
			type:'put',
			contentType:'application/json',
			data:JSON.stringify(param),
			success:function(data){
				alert(data);
			},
			error:function(xhr,status,error){
				alert(xhr.responseText);
			}
		})
	})
})