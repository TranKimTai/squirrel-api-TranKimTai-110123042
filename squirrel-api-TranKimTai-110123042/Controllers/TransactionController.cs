using Microsoft.AspNetCore.Mvc;
using squirrel_api_Trankimtai_110123042.Models;
using System.Collections.Generic;
using System.Linq;

namespace squirrel_api_Trankimtai_110123042.Controllers
{
    [Route("api/giaodich")]
    [ApiController]
    public class TransactionController : ControllerBase
    {
        [HttpGet]
        public IActionResult GetDepositTransactions()
        {
            // Khởi tạo cứng 5 dòng dữ liệu y hệt đề bài cung cấp
            var transactions = new List<Transaction>
            {
                new Transaction { Id = 1, SoTaiKhoan = "1023456789", SoTien = 500000, LoaiGiaoDich = "Nap tien" },
                new Transaction { Id = 2, SoTaiKhoan = "1023456789", SoTien = 200000, LoaiGiaoDich = "Rut tien" },
                new Transaction { Id = 3, SoTaiKhoan = "1098765432", SoTien = 1000000, LoaiGiaoDich = "Nap tien" },
                new Transaction { Id = 4, SoTaiKhoan = "1098765432", SoTien = 150000, LoaiGiaoDich = "Rut tien" },
                new Transaction { Id = 5, SoTaiKhoan = "1055566677", SoTien = 300000, LoaiGiaoDich = "Nap tien" }
            };

            // Lọc ra các giao dịch có loại là "Nap tien" theo yêu cầu đề bài
            var result = transactions.Where(t => t.LoaiGiaoDich == "Nap tien").ToList();

            return Ok(result); // Xuất chuỗi JSON
        }
    }
}