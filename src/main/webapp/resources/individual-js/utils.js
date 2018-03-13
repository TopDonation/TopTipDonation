function onRoleChange(value) {

    var messageDiv = $("#warning_message");

    if(value === 'Admin'){
        messageDiv.show("slow");
    }
}

function closeRoleAlert(){
    $('#warning_message').hide();
}