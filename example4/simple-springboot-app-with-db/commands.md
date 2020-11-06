Building docker image:
```
docker build -t simple-app:1.0.0 .
```


List docker image:
```
docker images ls
```

Run docker container in background
```
docker run -p 8080:8080 -d --name simple-app-con-name simple-app:1.0.0
```

List docker containers(Running):
```
docker ps 
```

List all docker containers:
```
docker ps -a
```

Enter into docker container
```
docker exec -i -t simple-app-con-name2 /bin/sh
```


See docker logs
```
docker container logs simple-app-con-name
```