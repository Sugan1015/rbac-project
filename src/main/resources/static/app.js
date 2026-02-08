console.log("App loaded");

document.addEventListener("DOMContentLoaded", () => {
    console.log("DOM fully loaded");
});

function login() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    console.log("Login clicked");
    console.log("Sending request to backend...");

    fetch("/login", {   // 👈 IMPORTANT CHANGE HERE
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            username: username,
            password: password
        })
    })
    .then(response => {
        console.log("Raw response:", response);
        return response.json();
    })
    .then(data => {
        console.log("Backend response:", data);
        alert(data.message + " : " + data.username);
        window.location.href = "/dashboard.html";
    })
    .catch(error => {
        console.error("Fetch error:", error);
    });
}




