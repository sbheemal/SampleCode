function validate(){
	 
	var uname=form.username.value;
	var pword=form.pwd.value;
	if(uname==""||uname==null){
		document.getElementById('erroru').innerHTML=" * Please enter user Name"
			return false;
	}else if(pword==""||pword==null){
		document.getElementById('errorp').innerHTML=" * Please enter Password"
			
			return false;
	}else{
		return true;
	}
	}
	
