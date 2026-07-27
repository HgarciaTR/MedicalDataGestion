function iniciarSesion(){

    const correo = document.getElementById("correo").value;
    const password = document.getElementById("password").value;

    if(correo === "" || password === ""){

        alert("Por favor complete todos los campos.");

        return;

    }

    window.location.href="menu.html";

}

function guardarMedicamento(){

    const nombre=document.getElementById("nombreMedicamento").value;

    const cantidad=document.getElementById("cantidad").value;

    const fecha=document.getElementById("fecha").value;

    if(nombre==="" || cantidad==="" || fecha===""){

        alert("Complete todos los campos obligatorios.");

        return;

    }

    alert("Medicamento registrado correctamente.");

}