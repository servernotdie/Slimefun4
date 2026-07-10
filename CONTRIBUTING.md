# Hướng dẫn đóng góp

Trước khi đóng góp code cho Slimefun bản Hán hóa, bắt buộc phải đọc hướng dẫn đóng góp này.

# Thiết lập môi trường

Chúng tôi cung cấp hệ thống kiểm tra định dạng tự động, vui lòng sử dụng `./gradlew spotlessApply` để khởi tạo.

Dự án đã cung cấp `.editorconfig` để kiểm soát phong cách code. Nếu bạn có phong cách code riêng, vui lòng chuyển sang cấu hình phong cách của repo hiện tại trước khi đóng góp.

# Thiết lập nhánh

Trước khi bắt đầu đóng góp, vui lòng xác nhận code của bạn dựa trên nhánh `dev`.

# Quy chuẩn thông điệp commit

Dự án này **bắt buộc sử dụng** quy chuẩn thông điệp commit [Conventional Commits](https://www.conventionalcommits.org/zh-hans/v1.0.0/).

> Nói đơn giản, thông điệp commit của bạn cần bao gồm nội dung sau:
> 
> <loại>[phạm vi tùy chọn]: <mô tả>
> 
> Ví dụ một commit thêm chức năng mới nên là feat(item): add new item to Slimefun

Nếu code bạn commit giải quyết hoặc xử lý vấn đề trong Issue, vui lòng khai báo rõ ràng ngoài thông điệp commit chính.

> Như resolves #114514, fix #114514, v.v.

Nếu là sửa lỗi vui lòng khai báo trong thông điệp commit chính, không cần khai báo lặp lại.

Chúng tôi hỗ trợ regex tiền tố loại sau: `(feat(ure)?|fix|docs|style|refactor|ci|chore|perf|build|test|revert|trans)`

Ngoài ra, nếu là commit liên quan đến dịch thuật, loại nên là trans.

# Quy chuẩn code

**!! Dự án này sử dụng thụt lề 4 khoảng trắng !!**

Vui lòng không rút ngắn độ dài code quá mức, giảm khoảng trắng cũng không làm Slimefun chạy nhanh hơn.

Chúng tôi sử dụng Spotless làm công cụ định dạng code, trước khi commit bạn **bắt buộc** sử dụng `./gradlew spotlessCheck spotlessApply` để tự động định dạng code, nếu không sẽ bị trình kiểm tra định dạng chặn PR.

# Loại code commit

Code bạn commit có thể là sửa lỗi, thêm nội dung mới và API.

Code downstream hiện hỗ trợ commit code liên quan API, các nhà phát triển có thể phụ thuộc Slimefun bản Hán hóa thông qua jitpack.
