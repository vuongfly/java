public static void main(String[] args) {
	
}

public void merge(int arr, left, mid, right){
	int i,j,k;
	int n1 = mid - left +1;
	int n2 = right - mid;
	// tao 2 chuoi de luu 
	int leftArr[];
	int rightArr[];
	int k = left; // de cho k = voi gia tri dau tien trong chuoi, de su dung k them tung phan tu nho nhat vao chuoi
	// luu gia tri vao trong 2 chuoi
	for (int i = 0; i< n1 ; i++ ) {
		leftArr[i];
	}
	for (int i = 0; i< n1 ; i++ ) {
		rightArr[i];
	}
	i = 0;
	j = 0;
	// so sanh 2 side de tim ra tung gia tri nho nhat de thay vao arr
	while(i < n1 && j < n2){
		if (leftArr[i] < rightArr[j]) {
			arr[k] = leftArr[i];
			k++;
			i++;
		} else{
			arr[k] = leftArr[j];
			k++;
			j++;
		}
	}
	// sau doan ben tren, 2 side se co 1 side con lai phan tu (do 1 side da het)
	// bh se them cac not phan tu do vao trong chuoi
	while(i < n1){
		arr[k++] = leftArr[i++]
	}
	while(j < n2){
		arr[k++] = leftArr[j++]
	}
}

public void mergeSort(int arr[], int left, int right){
	if (left < right) {
		int mid = left + (right -1)/2;		// tim gia tri mid
		mergeSort(arr, left, mid);			// merge nua ben trai
		mergeSort(arr, mid +1, right);		// merge nua ben phai
		/*sau khi chia nho xong, se tien hanh sort:
		left, mid, right: index cua vung dc merge */
		
		merge(arr, left, mid, right);
		// khi nao se chay func merge?
		// sau khi mergeSort den luc left = right (moi side se chi con 1 phan tu) se k goi de quy nua va se tien hanh sap xep
	}
}