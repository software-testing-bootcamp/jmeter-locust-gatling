from locust import HttpUser, task


class BlazeDemo(HttpUser):
    @task
    def hello_world(self):
        self.client.get("/", name="HomePage")
        self.client.get("/config.json", name="ConfigJson")
        self.client.get("https://api.demoblaze.com/entries", name="Entries", verify=False)
        self.client.get("/prod.html", name="ProdHtml")
        self.client.post("https://api.demoblaze.com/view", name="POST_View", json={"id":"1"})
        self.client.post("https://api.demoblaze.com/addtocart", name="POST_AddToCart", json={"id":"e83fcc75-801e-53ff-e9f1-bf470cf1a2d4","cookie":"user=d408a36d-88c4-396f-4dcb-8811ad9ff028","prod_id":"1","flag":"false"}, verify=False)

