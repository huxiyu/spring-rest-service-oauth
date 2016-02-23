<?php

$curl = curl_init();

curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);

// 获取access_token
curl_setopt_array($curl, array(
  CURLOPT_PORT => "8443",
  CURLOPT_URL => "https://localhost:8443/oauth/token",
  CURLOPT_RETURNTRANSFER => true,
  CURLOPT_ENCODING => "",
  CURLOPT_MAXREDIRS => 10,
  CURLOPT_TIMEOUT => 30,
  CURLOPT_HTTP_VERSION => CURL_HTTP_VERSION_1_1,
  CURLOPT_CUSTOMREQUEST => "POST",
  CURLOPT_HTTPHEADER => array(
    "authorization: Basic " . base64_encode("remoteclientapp:schedule@restful"),
    "cache-control: no-cache",
    "content-type: application/x-www-form-urlencoded"
  ),
  CURLOPT_POSTFIELDS => "username=greg&password=spring&grant_type=password&scope=read%20write"

));

$response = curl_exec($curl);
$err = curl_error($curl);

if ($err) {
  echo "cURL Error #:" . $err;
} else {
  echo $response.'<br /><br />';
}

// 返回的token结果,json格式
// {
// "access_token":"fce2ef6e-0d18-457a-8381-405cceb09b25","token_type":"bearer",
// "refresh_token":"32e96812-796e-4779-a42b-53ded65daa5a","expires_in":43195,"scope":"read write"
// }
// json转对象
$token = json_decode($response);
echo $token->{'access_token'}.'<br /><br />';; // 12345

// 增加用户
curl_setopt_array($curl, array(
  CURLOPT_PORT => "8443",
  CURLOPT_URL => "https://localhost:8443/greeting",
  CURLOPT_RETURNTRANSFER => true,
  CURLOPT_ENCODING => "",
  CURLOPT_MAXREDIRS => 10,
  CURLOPT_TIMEOUT => 30,
  CURLOPT_HTTP_VERSION => CURL_HTTP_VERSION_1_1,
  CURLOPT_CUSTOMREQUEST => "POST",
  CURLOPT_HTTPHEADER => array(
    "authorization: ".$token->{'token_type'}.$token->{'access_token'},
    "cache-control: no-cache",
    "content-type: application/x-www-form-urlencoded"
  )
));

$response = curl_exec($curl);
$err = curl_error($curl);

if ($err) {
  echo "cURL Error #:" . $err;
} else {
  echo $response;
}

curl_close($curl);
?>
